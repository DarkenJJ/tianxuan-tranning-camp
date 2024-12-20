package com.thanos.web3j.model.event;

import com.thanos.common.utils.ByteUtil;
import com.thanos.common.utils.Numeric;
import com.thanos.common.utils.rlp.RLP;
import com.thanos.common.utils.rlp.RLPList;

/**
 * VoteCommitteeCandidateEvent.java description：
 *
 * @Author laiyiyu create on 2021-03-31 16:15:11
 */
public class VoteCommitteeCandidateEvent extends VoteEvent {

    byte[] voteCommitteeAddr;

    public VoteCommitteeCandidateEvent(int voteType, int processType, byte[] proposalId, byte[] voteCommitteeAddr) {
        super(null);
        this.voteType = voteType;
        this.processType = processType;
        this.proposalId = proposalId;
        this.voteCommitteeAddr = voteCommitteeAddr;
        this.rlpEncoded = rlpEncoded();
    }

    public VoteCommitteeCandidateEvent(byte[] encode) {
        super(encode);
    }

    @Override
    public GlobalEventCommand getEventCommand() {
        return GlobalEventCommand.VOTE_COMMITTEE_CANDIDATE;
    }

    public byte[] getVoteCommitteeAddr() {
        return voteCommitteeAddr;
    }

    @Override
    protected byte[] rlpEncoded() {
        byte[] voteType = RLP.encodeInt(this.voteType);
        byte[] processType = RLP.encodeInt(this.processType);
        byte[] proposalId = RLP.encodeElement(this.proposalId);
        byte[] voteCommitteeAddr = RLP.encodeElement(this.voteCommitteeAddr);
        return RLP.encodeList(voteType, processType, proposalId, voteCommitteeAddr);
    }

    @Override
    protected void rlpDecoded() {
        RLPList rlpInfo = (RLPList) RLP.decode2(rlpEncoded).get(0);
        this.voteType = ByteUtil.byteArrayToInt(rlpInfo.get(0).getRLPData());
        this.processType = ByteUtil.byteArrayToInt(rlpInfo.get(1).getRLPData());
        this.proposalId = ByteUtil.copyFrom(rlpInfo.get(2).getRLPData());
        this.voteCommitteeAddr = ByteUtil.copyFrom(rlpInfo.get(3).getRLPData());
    }

    @Override
    public String toString() {
        return "VoteCommitteeCandidateEvent{" +
                "voteCommitteeAddr=" + Numeric.toHexString(voteCommitteeAddr) +
                ", voteType=" + voteType +
                ", processType=" + processType +
                ", proposalId=" + new String(proposalId) +
                '}';
    }
}
