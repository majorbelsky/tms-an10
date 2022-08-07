package io.devmartynov.tmsAn10Java.l8.additional.document;

import java.util.Date;

/**
 * ProductContract
 */
public class ProductContract extends Document {
    private String productType;
    private int productsCount;

    /**
     * Ctor.
     */
    public ProductContract() {
        super();
    }

    /**
     * Ctor.
     *
     * @param productType   productType
     * @param productsCount productsCount
     */
    public ProductContract(int number, Date date, String productType, int productsCount) {
        super(number, date);
        this.productType = productType;
        this.productsCount = productsCount;
    }

    /**
     * Product type
     *
     * @return product type
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets product type
     *
     * @param productType type
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Products count
     *
     * @return productsCount
     */
    public int getProductsCount() {
        return productsCount;
    }

    /**
     * Sets products count
     *
     * @param productsCount productsCount
     */
    public void setProductsCount(int productsCount) {
        this.productsCount = productsCount;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Document: "
                + "type: " + this.getClass().getSimpleName()
                + ", " + super.getInfo()
                + ", product type: " + productType
                + ", products count: " + productsCount
        );
    }
}
