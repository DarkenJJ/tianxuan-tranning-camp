package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed72x64 extends Ufixed {
    public static final Ufixed72x64 DEFAULT = new Ufixed72x64(BigInteger.ZERO);

    public Ufixed72x64(BigInteger value) {
        super(72, 64, value);
    }

    public Ufixed72x64(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(72, 64, m, n);
    }
}
