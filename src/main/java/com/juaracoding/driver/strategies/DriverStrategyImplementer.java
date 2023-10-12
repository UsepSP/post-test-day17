package com.juaracoding.driver.strategies;

import com.juaracoding.driver.strategies.Chrome;
import com.juaracoding.driver.strategies.DriverStrategy;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy (String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            default:
                return null;
        }
    }

}
