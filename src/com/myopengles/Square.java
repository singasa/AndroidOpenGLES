
package com.myopengles;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

// Define vertex shaded square
class Square {

    private FloatBuffer mFVertexBuffer;
    private ByteBuffer  mColorBuffer;
    private ByteBuffer  mIndexBuffer;

    public Square()
    {
        float vertices[] = 
        {
        }; 

        byte maxColor=(byte)255;
        
        byte colors[] = 
        {
        }; 
        
        byte indices[] = 
        {
        };
    }

    public void draw(GL10 gl)
    {
    }

}
