public class Emp_UC6 {

    public static void main(String args[])
    {
        final int pt = 1;
        final int ft = 2;
        final int wph = 20;
        final int maxWorkingDays = 20;
        final int maxWorkingHour = 100;

        int totalWage = 0;
        int workinghour = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "workinghours", "wage", "Total workinghours");
        for (int day = 1, totalworkinghour = 0; day <= maxWorkingDays
                && totalworkinghour < maxWorkingHour; day++, totalworkinghour += workinghour)
        {

            int employee = (int) (Math.random() * 100) % 3;
            switch (employee)
            {
                case ft:
                    workinghour = 8;
                    break;
                case pt:
                    workinghour = 4;
                    break;
                default:
                    workinghour = 0;
                    break;
            }
            int wage = workinghour * wph;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workinghour, wage, totalworkinghour + workinghour);

        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
