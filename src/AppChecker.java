public class AppChecker {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Calculator on Android");
        android.runAndroidApp();
        android.appInfo();

        IphoneApp iphone = new IphoneApp("Calculator on Iphone");
        iphone.runIphoneApp();
        iphone.appInfo();
    }
}
