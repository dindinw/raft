package io.dindinw.raft.api;

/**
 * The protocol
 */
public class Raft {

    enum RaftStatus {
        Follower,
        Candidate,
        Leader
    }

}
