package sathish.com.singleton;

/**
 * Created by Sathish on 19-03-2016.
 */
public class Singleton {
    private static Singleton mInstance = null;

    private String mString;

    public String getMtest() {
        return mtest;
    }

    public void setMtest(String mtest) {
        this.mtest = mtest;
    }

    public static Singleton getmInstance() {
        return mInstance;
    }

    public static void setmInstance(Singleton mInstance) {
        Singleton.mInstance = mInstance;
    }

    public String getmString() {
        return mString;
    }

    public void setmString(String mString) {
        this.mString = mString;
    }

    private String mtest;
    private Singleton() {
        mString = "Hello";
        mtest="Sathish";
    }

    public static Singleton getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public String getString() {
        return this.mString;
    }

    public void setString(String value) {
        mString = value;
    }

}
