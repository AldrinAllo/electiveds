package lilo;

/**
 * Hello world!
 *
 */
public class Chips
{
    private int id;
    private String brand;

    public Chips(int id, String brand)
    {
        this.id = id;
        this.brand = brand;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chips chips = (Chips) o;

        return id == chips.id;
    }

    @Override
    public int hashCode()
    {
        return id;
    }

    @Override

    public String toString()
    {
        return "id: " + id + " brand: " + brand;
    }
}
