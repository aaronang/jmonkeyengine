package com.jme3.effect;

import org.junit.Before;
import org.junit.Test;

import com.jme3.scene.Mesh;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ParticleEmitterTest {

    private ParticleEmitter particleEmitter;

    @Before
    public void setUp() {
        particleEmitter = new ParticleEmitter("test", new ParticlePointMesh(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMeshNull() {
        particleEmitter.setMesh(null);
    }

    @Test
    public void testSetMesh() {
        Mesh mockedMesh = mock(ParticlePointMesh.class);
        particleEmitter.setMesh(mockedMesh);
        assertEquals(mockedMesh, particleEmitter.getMesh());
    }

}