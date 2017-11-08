package za.ac.cput.ExtremeCoders;

public class TelevisionSets
{
    private int serialNumber;
    private String type;
    private String model;

    public TelevisionSets(int serialNumber, String type, String model)
    {
        this.serialNumber = serialNumber;
        this.type = type;
        this.model = model;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TelevisionSets that = (TelevisionSets) o;

        return serialNumber == that.serialNumber;
    }

    @Override
    public int hashCode() {
        return serialNumber;
    }

    @Override
    public String toString()
    {
        return "serialNumber: " + serialNumber + " type: " + type + " model: " + model;
    }
}

