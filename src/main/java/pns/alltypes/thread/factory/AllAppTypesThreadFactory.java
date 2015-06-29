/*
 * PnsAppThreadFactory.java
 * @author arung
 **********************************************************************

             Copyright (c) 2004 - 2014 by Sling Media, Inc.

All rights are reserved.  Reproduction in whole or in part is prohibited
without the written consent of the copyright owner.

Sling Media, Inc. reserves the right to make changes without notice at any time.

Sling Media, Inc. makes no warranty, expressed, implied or statutory, including
but not limited to any implied warranty of merchantability of fitness for any
particular purpose, or that the use will not infringe any third party patent,
copyright or trademark.

Sling Media, Inc. must not be liable for any loss or damage arising from its
use.

This Copyright notice may not be removed or modified without prior
written consent of Sling Media, Inc.

 ***********************************************************************/
package pns.alltypes.thread.factory;

import java.util.concurrent.ThreadFactory;

public class AllAppTypesThreadFactory implements ThreadFactory {
    private final String poolName;

    public AllAppTypesThreadFactory(final String poolName) {
        this.poolName = poolName;
    }

    @Override
    public Thread newThread(final Runnable runnable) {
        return new AllTypesAppThread(runnable, poolName);
    }
}