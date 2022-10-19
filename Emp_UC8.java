public class Emp_UC8 {
    public static void calculateTotalWage(String companyName, int wph,
                                          int maxWorkingDay, int maxWorkingHour)
    {
        final int pt = 1;
        final int ft = 2;
        int totalWage = 0;
        int wh = 0;

        System.out.println(" Company enquiry = " + companyName);
        System.err.println(" Wage Per Hour : " + wph);
        System.out.println(" Maximum Working Days : " + maxWorkingDay);
        System.out.println(" Maximum Working Hours : " + maxWorkingHour);
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghour", "wage", "Total workinghours");

        for (int day = 1, totalworkinghours = 0; day <= maxWorkingDay
                && totalworkinghours <= maxWorkingHour; day++, totalworkinghours += wh)
        {
            int emp = (int) (Math.random() * 100) % 3;
            switch (emp)
            {
                case ft:
                    wh = 8;
                    break;
                case pt:
                    wh = 4;
                    break;
                default:
                    wh = 0;
                    break;
            }
            int wage = wh * wph;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, wh, wage, totalworkinghours + wh);
        }
        System.out.println("Total wage for a month of " + companyName + " employee is " + totalWage + "\n");
    }
    public static void main(String args[])
    {
        calculateTotalWage(" Amazon ", 30, 20, 200);
        calculateTotalWage(" Flipkart ", 20, 10, 100);
        calculateTotalWage(" Myntra " , 10,  5,  50);
    }
}
