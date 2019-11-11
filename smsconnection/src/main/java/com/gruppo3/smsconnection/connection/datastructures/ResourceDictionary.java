package com.gruppo3.smsconnection.connection.datastructures;

import com.gruppo3.smsconnection.connection.Peer;

import java.util.Dictionary;
import java.util.List;

public abstract class ResourceDictionary<P extends Peer,R extends Resource> {
    private Dictionary<P,R> dictionary;

    public abstract P findPeerWithResource(R resource);
    public abstract List<R> findPeerResounces(P peer);
    public abstract List<P> getAvailablePeers();
    public abstract List<R> getAvailableResources();
    public void add(P peer,R resource){
        if(canAdd()){
            dictionary.put(peer,resource);
        }
            dictionary.put(peer,resource);
    }
    public void remove(P peer,R resource){
        if(canRemove())
            dictionary.re(peer,resource);
    }
    protected abstract boolean canAdd();
    protected abstract boolean canRead();
    protected abstract boolean canRemove();

}
