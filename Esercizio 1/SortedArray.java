import java.util.*;

public class SortedArray
{
    private int[] v;
    public SortedArray()
    {
      this.v[] = v[];
    }

    public boolean isEmpty()
    {
      boolean ris = false;
      boolean[] fin = new boolean[v.length];
      for(int i = 0; i <v.length; i++)
      {
        if (v[i] == null)
        {
          fin[i] = true;
        }
        else
        {
          fin[i] = false;
        }
      }
      for (int j = 0; j < v.length; j++)
      {
        if(fin[j] == false)
        {
          return ris = false;
        }
      }
      ris = true;
      return ris;
    }

    public void add(int value)
    {
      for(int i = 0; i < v.length; i++)
      {
        if(value < v[i+1] && value > v[i])
        {
          int[] v1 = new int[v.length + 1];
          for(int j = 0; j < value; j++)
          {
            v1[j] = v[j];
            v1[value] = value;
          }
          for (int k = value + 1; k < v1.length; k++)
          {
            v1[k] = v[v.length];
          }
        }
      }
    }

    public int removeMax() throws NoSuchElementException
    {
      int max = v.get(0);

      for (int i = 1; i < v.length; i++)
      {
        if (v.get(i) > max)
        {
          max = v.get(i);
        }
      }
      return max;
    }

    public double avg()
    {
    int somma = 0;
      for (int i = 0; i < arraySize; i++)
          somma += array[i];
          return somma / (double) arraySize;
    }
}
