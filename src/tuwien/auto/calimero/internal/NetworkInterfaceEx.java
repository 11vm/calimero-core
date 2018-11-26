/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuwien.auto.calimero.internal;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class NetworkInterfaceEx
{
    public static <U> CompletableFuture<U> failedFuture(Throwable ex)
    {
        CompletableFuture<U> cf = new CompletableFuture<>();
        cf.completeExceptionally(ex);
        return cf;
    }

    static public Stream<InetAddress> inetAddresses(NetworkInterface ni)
    {
        if (ni != null)
            return Collections.list(ni.getInetAddresses()).stream();
        return Stream.empty();
    }

    public static Stream<NetworkInterface> networkInterfaces() throws SocketException
    {
        return Collections.list(NetworkInterface.getNetworkInterfaces()).stream();
    }
}
