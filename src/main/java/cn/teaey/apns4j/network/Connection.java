package cn.teaey.apns4j.network;
import java.io.Closeable;
import java.io.IOException;

/**
 * User: Teaey
 * Date: 13-9-1
 *
 * @author xiaofei.wxf
 * @version $Id: $Id
 */
public interface Connection extends Closeable
{
    /**
     * Writes <code>data.length</code> bytes from the specified byte array
     * to this connection
     *
     * @param data an array of byte.
     * @throws java.io.IOException if any.
     */
    void send(byte[] data) throws IOException;
    /**
     * Reads some number of bytes from the connection and stores them into
     * the buffer array <code>data</code>. The number of bytes actually read is
     * returned as an integer.
     *
     * @param data an array of byte.
     * @return a int.
     * @throws java.io.IOException if any.
     */
    int recv(byte[] data) throws IOException;
}
