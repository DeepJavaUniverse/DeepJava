package com.dj.core.optimizer;


public class TerminalOptimizerProgressListener implements OptimizerProgressListener {
    
    public void onProgress(
            final double loss,
            final int currentEpoch,
            final int targetEpoch) {
        System.out.printf(
                "LOSS: %5f, Epoch: %d of %d\n",
                loss,
                currentEpoch,
                targetEpoch);
    }
}
