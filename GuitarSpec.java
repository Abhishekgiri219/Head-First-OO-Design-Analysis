package Head_First_OO_Design.GuitarShop;

import java.util.Objects;

public class GuitarSpec {
    private Builder builder;
    private Wood backWood;
    private Wood topWood;
    private Type type;
    private String model;

    public GuitarSpec(Builder builder, Wood backWood, Wood topWood, Type type, String model){
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GuitarSpec)) return false;
        GuitarSpec that = (GuitarSpec) o;
        return builder == that.builder &&
               backWood == that.backWood &&
               topWood == that.topWood &&
               type == that.type &&
               Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, backWood, topWood, type, model);
    }

    @Override
    public String toString(){
        return new String(builder.name() + " - " + backWood.name() + " - " + topWood.name() + " - " + type.name() +" - " + model);
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void setBackWood(Wood wood){
        this.backWood = wood;
    }

    public void setTopWood(Wood wood){
        this.topWood = wood;
    }

    public void setType(Type type){
        this.type = type;
    }

    public void setModel(String model){
        this.model = model;
    }

    public Builder getBuilder(){
        return builder;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood(){
        return topWood;
    }

    public Type getType() {
        return type;
    }

    public String getModel(){
        return model;
    }
}
