package kr.co.ss.product.domain;

/**
 * 사용자가 보는 상세 상품정보
 * @author sist
 */
public class ProductDetailUserDomain {
	
	private int prod_num;
	private String prod_name;
	private String prod_price;
	private String prod_explain;
	private String prod_image;

	
	public ProductDetailUserDomain() {
		super();
	}


	public ProductDetailUserDomain(int prod_num, String prod_name, String prod_price, String prod_explain,
			String prod_image) {
		super();
		this.prod_num = prod_num;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_explain = prod_explain;
		this.prod_image = prod_image;
	}


	public int getProd_num() {
		return prod_num;
	}


	public void setProd_num(int prod_num) {
		this.prod_num = prod_num;
	}


	public String getProd_name() {
		return prod_name;
	}


	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}


	public String getProd_price() {
		return prod_price;
	}


	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}


	public String getProd_explain() {
		return prod_explain;
	}


	public void setProd_explain(String prod_explain) {
		this.prod_explain = prod_explain;
	}


	public String getProd_image() {
		return prod_image;
	}


	public void setProd_image(String prod_image) {
		this.prod_image = prod_image;
	}


	
	
}//class
