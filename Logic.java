public class Logic {
    public static void main(String[]args){
        double temp = 30;
        boolean isSunny = true;

        if (temp <=30 && temp >=0 && isSunny){
            System.out.println("Weather is good Sunny 🌞!");
            System.out.println("Weather is good Good 😎!");
        } else if (temp <30 && temp >0 && !isSunny) {
            System.out.println("Weather is good Good 😎!");
            System.out.println("Weather is good Cloudy ⛅!");
        } else if (temp >30 || temp < 0) {
            System.out.println("Weather is bad 😏!");
        }
    }
}
