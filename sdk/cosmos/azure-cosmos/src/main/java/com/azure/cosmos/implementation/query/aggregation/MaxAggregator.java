// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.query.aggregation;

import com.azure.cosmos.implementation.Undefined;
import com.azure.cosmos.implementation.query.ItemComparator;

public class MaxAggregator implements Aggregator {
    private Object value;

    public MaxAggregator() {
        this.value = Undefined.Value();
    }

    @Override
    public void aggregate(Object item) {
        if (Undefined.Value().equals(this.value)) {
            this.value = item;
        } else if (ItemComparator.getInstance().compare(item, this.value) > 0) {
            this.value = item;
        }

    }

    @Override
    public Object getResult() {
        return this.value;
    }
}
