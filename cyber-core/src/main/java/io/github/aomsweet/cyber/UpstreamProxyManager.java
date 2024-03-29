/*
  Copyright 2021 The Cyber Project

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package io.github.aomsweet.cyber;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Queue;

/**
 * @author aomsweet
 */
public interface UpstreamProxyManager {

    Queue<? extends UpstreamProxy> lookupUpstreamProxies(Object requestObject,
                                                         Credentials credentials,
                                                         SocketAddress clientAddress,
                                                         InetSocketAddress serverAddress) throws Exception;

    void failConnectExceptionCaught(UpstreamProxy upstreamProxy, InetSocketAddress serverAddress, Throwable throwable) throws Exception;

}
