package com.example.boilerplateapp.module

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ModuleATests {
	@Test
	internal fun testAdd() {
		val moduleA = ModuleA()
		assertEquals(moduleA.add(1, 2), 3)
	}
}
