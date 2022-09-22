class UncheckedExp extends RuntimeException
{

}
class CheckedExp extends Exception
{

}
class UncheckedDemo
{
    static void process()throws CheckedExp
    {
        //throw new UncheckedExp();
        throw new CheckedExp();
    }
    public static void main(String[]args)
    {
        int arr[] = new int[10];
        int index = -1;

        process();
        //arr[index] = 100;
    }
}