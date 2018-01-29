// This class was generated on Mon, 29 Jan 2018 12:12:03 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Tax.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6yTYWvbPhDG3/8/xaFXLThx/9tgkHdlZbCNtWUrg9GF9iKd42Oy5J3OSc3odx9y4rZpAmPQV0aPT7r7PXr021z1LZmZUbwzhfmGwrjwdI7No/iJ+u3aFOaMkhVulWMwM3NVEyjegacVk4NFDwjLuCIJDQWFGEBrgrYTW2MiiBUsY3QJokAiWbGlNDWFORXBfjPISWG+ELqL4Hszq9AnysKvjoXcg3ApsSVRpmRm1w8In2Og/iDEDTaxC7rDsiPvU9lOhILtAYODTR1UUQCh4oDBMnpYoe9oIuRRyUHF5N0U3kcBusOm9VTAAj0GS5m3xX7wxHX0cshJhcNyn3mc/sZGRzvYz//sk19rLUQTW6OgVRL48PVi8ubV/28fPcl750elizaVHJSWgvmA0rGQ1VIoaTkWT3JxKo9Ba1RgR0G5YkpDMsaif3JEpXtmSOi8vy/+6spwXztujMq+C8OfAtY12xoaXtYKC5r96E5OXtvOD1/arDxvVqcBBi9IhqBs0TKp558Etx8vv99uTEAhCFFB+5Ytet9Dla3mGNBPN4eW46nPeoAjyw36hx2He12dnz3plbqF4xU7cnnCCFrHLmFwWqfD7cqRMIc535NszYfQNQuS/JDHQVqPltL2bewkpIBEBNfvnmoJJjlPkPM0P6pV2zQry/V6PeUUp1GWJac4pG2yG6BprY0/fomczO/n9//9AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.sync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The tax levied by a government on the purchase of goods or services.
 */
@Model
public class Tax {

    // Required default constructor
    public Tax() {}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("tax_amount")
	private Money taxAmount;

	public Money taxAmount() { return taxAmount; }
	
	public Tax taxAmount(Money taxAmount) {
	    this.taxAmount = taxAmount;
	    return this;
	}
}
