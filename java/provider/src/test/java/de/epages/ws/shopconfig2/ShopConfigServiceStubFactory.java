package de.epages.ws.shopconfig2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shopconfig2.stub.*;

public interface ShopConfigServiceStubFactory {
    Port_ShopConfig create(WebServiceConfiguration config, ShopConfigService service);
}
