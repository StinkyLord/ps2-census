package stinkybot.utils.daybreakutils.query.dto.util;

public class CurrencyObject {
	private String currency_id;
	private String currency_name;
	private String quantity;
	private String prestige_currency;
	public String getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}
	public String getCurrency_name() {
		return currency_name;
	}
	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrestige_currency() {
		return prestige_currency;
	}
	public void setPrestige_currency(String prestige_currency) {
		this.prestige_currency = prestige_currency;
	}
	@Override
	public String toString() {
		return "CurrencyObject [currency_id=" + currency_id + ", currency_name=" + currency_name + ", quantity="
				+ quantity + ", prestige_currency=" + prestige_currency + "]";
	}
	
	
}
