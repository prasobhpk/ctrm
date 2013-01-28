package com.snimmo.ctrm.object.trade;

import java.util.HashMap;

public enum TradeType {
	
	RegularTrade(0), BlockTrade(1);

    private int code;
    
    private TradeType(int code) {
		this.code = code;
	}

    private static HashMap<Integer, TradeType> codeValueMap = new HashMap<>(2);

    static
    {
        for (TradeType  type : TradeType.values())
        {
            codeValueMap.put(type.code, type);
        }
    }

    public static TradeType getInstance(int codeValue)
    {
        return codeValueMap.get(codeValue);
    }

}
