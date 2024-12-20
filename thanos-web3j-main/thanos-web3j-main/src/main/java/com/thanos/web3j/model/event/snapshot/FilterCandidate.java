package com.thanos.web3j.model.event.snapshot;

import com.thanos.common.utils.ByteUtil;
import com.thanos.common.utils.rlp.RLP;
import com.thanos.common.utils.rlp.RLPList;
import com.thanos.web3j.model.RLPModel;
import com.thanos.web3j.model.event.CaContractCode;
import com.thanos.web3j.model.event.VoteFilterCandidateEvent;

import java.util.Objects;

/**
 * FilterCandidate.java description：
 *
 * @Author laiyiyu create on 2021-04-06 14:47:41
 */
public class FilterCandidate extends RLPModel {

    int processType;

    CaContractCode caContractCode;

    public FilterCandidate(byte[] encode) {
        super(encode);
    }

    public FilterCandidate(int processType, CaContractCode caContractCode) {
        super(null);
        this.processType = processType;
        this.caContractCode = caContractCode;
        this.rlpEncoded = rlpEncoded();
    }

    public static FilterCandidate convertFrom(VoteFilterCandidateEvent candidateEvent) {
        FilterCandidate candidate = new FilterCandidate(candidateEvent.getProcessType(), new CaContractCode(ByteUtil.copyFrom(candidateEvent.getCaContractCode().getEncoded())));
        return candidate;
    }

    public int getProcessType() {
        return processType;
    }

    public CaContractCode getCaContractCode() {
        return caContractCode;
    }

    @Override
    protected byte[] rlpEncoded() {
        byte[] voteType = RLP.encodeInt(this.processType);
        byte[] caContractCode = this.caContractCode.getEncoded();
        return RLP.encodeList(voteType, caContractCode);
    }

    @Override
    protected void rlpDecoded() {
        RLPList rlpInfo = (RLPList) RLP.decode2(rlpEncoded).get(0);
        this.processType = ByteUtil.byteArrayToInt(rlpInfo.get(0).getRLPData());
        this.caContractCode = new CaContractCode(ByteUtil.copyFrom(rlpInfo.get(1).getRLPData()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterCandidate that = (FilterCandidate) o;
        return processType == that.processType &&
                Objects.equals(caContractCode, that.caContractCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processType, caContractCode);
    }

    @Override
    public String toString() {
        return "FilterCandidate{" +
                "processType=" + processType +
                ", caContractCode=" + caContractCode +
                '}';
    }
}
