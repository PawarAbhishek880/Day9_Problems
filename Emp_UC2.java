public class Emp_UC2 {
    public static void main(String args[])
    {
        int ft = 1;
        int wph = 20;
        int emp = (int)(Math.random()*100)%2;
        int wh= 0;
        if (emp == ft)
        {
            System.out.println(" Employee is present ");
            wh = 8;
        } else
        {
            System.out.println("Employee is absent ");
        }
        int wage = wh*wph;
        System.out.println(" Daily employee wage = " + wage);
    }
}
