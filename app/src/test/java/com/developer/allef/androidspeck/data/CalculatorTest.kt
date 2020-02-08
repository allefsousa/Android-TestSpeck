package com.developer.allef.androidspeck.data

import org.junit.Assert.*
import org.junit.Test
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import org.spekframework.spek2.style.specification.describe


/**
 * @author allef.santos on 2020-02-08
 */
class CalculatorTest : Spek({

    Feature("Some calculator") {
        val calculator = Calculator()

        Scenario("Addition") {
            val sum = calculator.sum(4, 4)

            Then("Should return the addition between first and second number") {
                assertEquals(8, sum)
            }
        }

        Scenario("Subtraction") {
            val subtract = calculator.subtract(10, 3)

            Then("Should return the subtraction between first and second number") {
                assertEquals(7, subtract)
            }
        }

        Scenario("Multiplying") {
            val multiple = calculator.multiple(3, 3)

            Then("Should return the multiplying between first and second number") {
                assertEquals(9, multiple)
            }
        }

        Scenario("Dividing") {
            val divide = calculator.divide(20, 2)

            Then("Should return the dividing between first and second number") {
                assertEquals(10, divide)
            }
        }
    }
})