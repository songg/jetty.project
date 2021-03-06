//
// ========================================================================
// Copyright (c) 1995-2020 Mort Bay Consulting Pty Ltd and others.
//
// This program and the accompanying materials are made available under
// the terms of the Eclipse Public License 2.0 which is available at
// https://www.eclipse.org/legal/epl-2.0
//
// This Source Code may also be made available under the following
// Secondary Licenses when the conditions for such availability set
// forth in the Eclipse Public License, v. 2.0 are satisfied:
// the Apache License v2.0 which is available at
// https://www.apache.org/licenses/LICENSE-2.0
//
// SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
// ========================================================================
//

package org.eclipse.jetty.websocket.common.endpoints.annotated;

import org.eclipse.jetty.websocket.api.annotations.OnWebSocketFrame;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.core.Frame;

@WebSocket
public class BadDuplicateFrameSocket
{
    /**
     * The get a frame
     *
     * @param frame the frame
     */
    @OnWebSocketFrame
    public void frameMe(Frame frame)
    {
        /* ignore */
    }

    /**
     * This is a duplicate frame type (should throw an exception attempting to use)
     *
     * @param frame the frame
     */
    @OnWebSocketFrame
    public void watchMe(Frame frame)
    {
        /* ignore */
    }
}
