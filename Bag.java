public class Bag<VariableType>{

    private String bagBrand;
    private String bagType;
    private VariableType bagColor;
    
    public void setBag_Color(VariableType bagColor){
        this.bagColor=bagColor;
    }
    public VariableType getBag_Color(){
        return bagColor;
    }
    public void setBag_Type(String bagType){
        this.bagType=bagType;
    }
    public String getBag_Type(){
        return bagType;
    }
    
    public void setBag_Brand(String bagBrand){
        this.bagBrand=bagBrand;
    }
    public String getBag_Brand(){
        return bagBrand;
    }

}