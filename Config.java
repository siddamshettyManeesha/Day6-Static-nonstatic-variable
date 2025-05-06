public class Config{
public static String configName="System Config";
public String settingValue;
public static void main(String[]args){
System.out.println("Config Name:"+Config.configName);
Config objref=new Config();
objref.settingValue="Dark Mode";
Config objref1=new Config();
objref1.settingValue="Light Mode";
System.out.println("Setting 1:"+objref.settingValue);
System.out.println("Setting 2:"+objref1.settingValue);
}
}



