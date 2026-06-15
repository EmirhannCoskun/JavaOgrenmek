package Generic;

public class Cift<K,V>{
    private K key;
    private V value;

    public Cift(K key , V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void bilgiBas()
    {
        System.out.println("Key: " + key + " Value: " + value);
    }
}
