const plays = {
    "hamlet": {"name": "Hamlet", "type": "tragedy"}, 
    "as-like": {"name": "As You Like It", "type": "comedy"}, 
    "othello": {"name": "Othello", "type": "tragedy"}
};
const invoices = {
  "customer": "BigCo",
  "performances": [
    {
      "playID": "hamlet",
      "audience": 55
    },
    {
      "playID": "as-like",
      "audience": 35
    },
    {
      "playID": "othello",
      "audience": 40
    }
  ]
}



function statement (invoice, plays) {
    let totalAmount = 0;
    let volumeCredits = 0;
    let result = `Statement for ${invoice.customer}\n`;
    const format = getFormat();

    for (let perf of invoice.performances)
    {
        const play =playFor(perf);
        let thisAmount = amountFor( perf);
        // print line for this order
        result += ` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
        totalAmount += thisAmount;
    }
    volumeCredits = totalVolumeCredit(invoice);
    result += `Amount owed is ${format(totalAmount/100)}\n`;
    result += `You earned ${volumeCredits} credits\n`;
    return result;
}
function totalVolumeCredit(invoice ) {
    let volumeCredits = 0;
    for (let perf of invoice.performances) {
        // add volume credits
        volumeCredits += getVolumeCredit(perf);
    }
    return volumeCredits;
}
function getFormat() {
    return new Intl.NumberFormat("en-US",
        {
            style: "currency",
            currency: "USD",
            minimumFractionDigits: 2
        }).format;
}

function amountFor( aPerformance) {
    const play = playFor(aPerformance);
    let thisAmount = 0;
    switch (play.type) {
        case "tragedy":
            thisAmount = 40000;
            if (aPerformance.audience > 30) {
                thisAmount += 1000 * (aPerformance.audience - 30);
            }
            break;
        case "comedy":
            thisAmount = 30000;
            if (aPerformance.audience > 20) {
                thisAmount += 10000 + 500 * (aPerformance.audience - 20);
            }
            thisAmount += 300 * aPerformance.audience;
            break;
        default:
            throw new Error(`unknown type: ${play.type}`);
    }
    return thisAmount;
}
function getVolumeCredit( aPerformance) {
    const play = playFor(aPerformance);
    let volumeCredits = 0;
    volumeCredits += Math.max(aPerformance.audience - 30, 0);
    // add extra credit for every ten comedy attendees
    if ("comedy" === play.type)
        volumeCredits += Math.floor(aPerformance.audience / 5);
    return volumeCredits;
}

function playFor(aPerformance) {
    return plays[aPerformance.playID];
}
let result = statement(invoices,plays);
console.log(result);