import java.util.*;

public class SortedArray
{
    private int[] v;
    private int vSize;
    public SortedArray()
    {
      this.v[] = v[];
      vSize = 0;
    }

    public boolean isEmpty()
    {
      return vSize == 0;
    }

    public void add(int value)
    {
      if (vSize == v.length)
      {
        int[] newArray = new int[2 * v.length];
        for(int i = 0; i < vSize; i++)
        {
          newArray[i] = v[i];
        }
        v = newArray;
      }
      for(int j = vSize; j > 0 && value < v[j - 1]; j--)
      {
        v[j] = v[j - 1];
      }
      v[j] = value;
      vSize++;
    }

    public int[] removeMax() throws NoSuchElementException
    {
      if(isEmpty())
      {
        throw new NoSuchElementException();
      }
      vSize--;
      return v[vSize];
    }

    public double avg()
    {
    int somma = 0;
      for (int i = 0; i < arraySize; i++)
          somma += array[i];
          return somma / (double) arraySize;
    }
}
