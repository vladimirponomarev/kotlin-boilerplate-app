package com.example.boilerplateapp.module

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ModuleATests {
	@Test
	internal fun testAdd() {
		val moduleA = ModuleA(1, 2)
		assertEquals(moduleA.add(), 3)
	}
}
