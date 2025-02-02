package com.abl.gss.converter;

import com.abl.live.market.data.stubs.FetchRequest;
import com.abl.live.market.data.stubs.MarketDataRequest;
import com.abl.gss.model.StockSearchInfo;

public class StockSearchInfoConverter {

    public static StockSearchInfo convert(MarketDataRequest request) {
        return new StockSearchInfo(
                request.getName()
        );
    }

    public static StockSearchInfo convert(FetchRequest request) {
        return new StockSearchInfo(
                request.getName()
        );
    }


}
