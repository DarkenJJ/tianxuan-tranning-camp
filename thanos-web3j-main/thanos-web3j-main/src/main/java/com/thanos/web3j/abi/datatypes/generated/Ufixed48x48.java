package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed48x48 extends Ufixed {
    public static final Ufixed48x48 DEFAULT = new Ufixed48x48(BigInteger.ZERO);

    public Ufixed48x48(BigInteger value) {
        super(48, 48, value);
    }

    public Ufixed48x48(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(48, 48, m, n);
    }
}
