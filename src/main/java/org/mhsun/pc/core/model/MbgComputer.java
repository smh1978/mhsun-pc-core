package org.mhsun.pc.core.model;

public class MbgComputer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer.id
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer.tradeMark
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    private String trademark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer.price
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer.pic
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    private String pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer.id
     *
     * @return the value of computer.id
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer.id
     *
     * @param id the value for computer.id
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer.tradeMark
     *
     * @return the value of computer.tradeMark
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer.tradeMark
     *
     * @param trademark the value for computer.tradeMark
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark == null ? null : trademark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer.price
     *
     * @return the value of computer.price
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer.price
     *
     * @param price the value for computer.price
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer.pic
     *
     * @return the value of computer.pic
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer.pic
     *
     * @param pic the value for computer.pic
     *
     * @mbg.generated Mon Aug 20 01:05:59 CST 2018
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}