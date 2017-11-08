package za.ac.cput.ExtremeCoders;

public class Car
{
    private int plateNr;
    private String brand;
    private String model;

    public Car(int plateNr, String type, String model)
    {
        this.plateNr = plateNr;
        this.brand = type;
        this.model = model;
    }

    public int getImei()
    {
        return plateNr;
    }

    public void setImei(int imei)
    {
        this.plateNr = imei;
    }

    public String getType()
    {
        return brand;
    }

    public void setType(String type)
    {
        this.brand = type;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Car that = (Car) o;

        return plateNr == that.plateNr;
    }

    @Override
    public int hashCode()
    {
        return plateNr;
    }

    @Override
    public String toString()
    {
        return "Plate Number: " + plateNr + " Brand:  " + brand + " model: " + model;
    }
}

