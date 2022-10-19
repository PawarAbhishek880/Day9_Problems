public class Emp_UC3 {
    public static void main(String args[])
    {
        int pt = 1;
        int ft = 2;
        int wph = 20;
        int emp = (int)(Math.random()*100)%3;
        int wh = 0;
        if (emp == ft)
        {
            System.out.println("Employee is present and is working for full-time");
            wh = 8;
        } else if (emp == pt)
        {
            System.out.println("Employee is present and is working for part-time");
            wh = 4;
        } else
        {
            System.out.println("Employee is absent");
        }
        int wage = wh*wph;
        System.out.println("Daily employee Wage = "+ wage);
    }
}
