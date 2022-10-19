public class Emp_UC7 {
    public static void calculateTotalWage()
    {
        final int pt = 1;
        final int ft = 2;
        final int wph = 20;
        final int maxWorkingDay = 20;
        final int maxWorkingHour = 100;

        int totalWage = 0;
        int workinghours = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghours", "Wage", "Total workinghours");
        for (int day = 1, totalworkinghours = 0; day <= maxWorkingDay
                && totalworkinghours < maxWorkingHour; day++, totalworkinghours += workinghours)
        {

            int emp = (int) (Math.random() * 100) % 3;
            switch (emp)
            {
                case ft:
                    workinghours = 8;
                    break;
                case pt:
                    workinghours = 4;
                    break;
                default:
                    workinghours = 0;
                    break;
            }
            int wage = workinghours * wph;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workinghours, wage, totalworkinghours + workinghours);

        }
        System.out.println("Total wage for a month is " + totalWage);
    }

    public static void main(String args[])
    {
        calculateTotalWage();

    }
}
