package za.ac.cput.ExtremeCoders;

public class Robot
{
    private int id;
    private String type;
    private String model;

    public Robot(int id, String type, String model)
    {
        this.id = id;
        this.type = type;
        this.model = model;
    }

    public int getImei()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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
    public boolean equals(java.lang.Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Robot that = (Robot) o;

        return id == that.id;
    }

    @Override
    public int hashCode()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "imei: " + id + " type: " + type + " model: " + model;
    }
}

