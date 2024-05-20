package com.learn.dsa.singleton;

public class TVset {
    private static volatile  TVset TvSetInstance = null;


    private TVset() {

    }

    // for getting instance
    public static TVset getTvSetInstance() {
        if (TvSetInstance == null)
            synchronized (TVset.class) {
                if (TvSetInstance == null)
                    TvSetInstance = new TVset();
            }

        return TvSetInstance;

    }

}
