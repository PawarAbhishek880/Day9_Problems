public class Emp_UC5 {
    public static void main(String args[])
    {
        final int pt = 1;
        final int ft = 2;
        final int wph = 20;
        final int wh = 20;

        int totalWage = 0;

        for (int day = 1; day <= wh; day++)
        {
            int emp = (int) (Math.random() * 100) % 3;
            int workingHours =0;

            switch (emp)
            {
                case ft:
                    workingHours = 8;
                    break;
                case pt:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours*wph;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
