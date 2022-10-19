public class Emp_UC4 {
    public static void main(String args[])
    {
        final int pt = 1;
        final int ft = 2;
        int wph = 20;
        int emp = (int)(Math.random()*100)%3;
        int wh =0;
        switch (emp)
        {
            case ft:
                System.out.println("Employee is Present and is working full-time");
                wh = 8;
                break;
            case pt:
                System.out.println("Employee is Present and is working part-time");
                wh = 4;
                break;
            default:
                System.out.println("employee is absent");
        }
        int wage = wh * wph;
        System.out.println(" daily employee wage=" + wage);
    }
}