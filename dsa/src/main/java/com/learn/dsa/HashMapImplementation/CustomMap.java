package com.learn.dsa.HashMapImplementation;

import org.yaml.snakeyaml.nodes.MappingNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomMap<K,V> {
    private List<MapNode<K ,V>> bucket;
    private int capcaity; // length of bucket
    private int size;// no of element in map
    private final int initialCapacity =5;
    public class MapNode<K,V> {
        K key;
        V val;
        MapNode<K,V> next;

        public MapNode(K key, V val){
            this.key = key;
            this.val = val;
        }

    }

    public CustomMap(){
        bucket = new ArrayList<>();
        capcaity = initialCapacity;
        for( int i =0 ; i< capcaity; i++){
            bucket.add(null);
        }

    }
    public int getBucketIndex(K key){
        int hasdCode = key.hashCode();
        return hasdCode % capcaity;
    }

    public V get(K key){
        int bucketIndesx = getBucketIndex(key);
        MapNode<K , V> temp = bucket.get(bucketIndesx);
        while( temp != null){
            if( temp.key.equals(key)){
                return temp.val;

            }
            temp = temp.next;
        }
        return null;

    }

    public void put( K key, V val){
        int bucketIndesx = getBucketIndex(key);
        MapNode<K , V> temp = bucket.get(bucketIndesx);
        while( temp != null){
            if( temp.key.equals(key)){
                 temp.val = val;
                 return;

            }
            temp = temp.next;
        }
        size++;
        MapNode<K , V> newEntry = bucket.get(bucketIndesx);
        newEntry.next = temp;
        bucket.set(bucketIndesx, newEntry);


        double loadFactor = ( 1 * size) / capcaity;
        if( loadFactor > 0.7)
            reHash();


    }
    public void remove(K key) {

        int bucketIndesx = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndesx);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null)
                    bucket.set(bucketIndesx, head.next);
                else
                    prev.next = head.next;

                head.next = null;
                size--;
                break;
            }
            prev = head;
            head = head.next;

        }
    }

    private void reHash() {
        List<MapNode< K , V>> temp = bucket;
        bucket = new ArrayList<>();
        capcaity *= 2;
        for (int i = 0; i < capcaity; i++) {
            bucket.add(null);
        }
        size =0;

        }

    }











