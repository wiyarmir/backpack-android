package net.skyscanner.backpack.card

import android.widget.TextView
import androidx.test.runner.AndroidJUnit4
import net.skyscanner.backpack.BpkSnapshotTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class BpkCardTest : BpkSnapshotTest() {

  @Before
  fun setup() {
    setDimensions(150, 150)
  }

  @Test
  fun screenshotTestCardDefault() {
    val card = BpkCardView(testContext)
    val text = TextView(testContext)
    text.text = "message"
    card.addView(text)
    snap(card)
  }

  @Test
  fun screenshotTestCardWithPadding() {
    val card = BpkCardView(testContext)
    val text = TextView(testContext)
    text.text = "message"
    card.addView(text)
    card.padded = true
    snap(card)
  }

  @Test
  fun screenshotTestCardWithoutPadding() {
    val card = BpkCardView(testContext)
    val text = TextView(testContext)
    text.text = "message"
    card.addView(text)
    card.padded = false
    snap(card)
  }

  @Test
  fun screenshotTestCardWithFocus() {
    val card = BpkCardView(testContext)
    val text = TextView(testContext)
    text.text = "message"
    card.addView(text)
    card.focused = true
    snap(card)
  }

  @Test
  fun screenshotTestCardWithoutPaddingAndFocus() {
    val card = BpkCardView(testContext)
    val text = TextView(testContext)
    text.text = "message"
    card.addView(text)
    card.padded = true
    card.focused = true
    snap(card)
  }

  @Test
  fun screenshotTestCardWithCornerStyleLarge() {
    val card = BpkCardView(testContext).apply {
      addView(TextView(testContext).apply {
        text = "message"
      })
      cornerStyle = BpkCardView.CornerStyle.LARGE
    }
    snap(card)
  }

  @Test
  fun screenshotTestCardWithCornerStyleLargeAndFocus() {
    val card = BpkCardView(testContext).apply {
      addView(TextView(testContext).apply {
        text = "message"
      })
      focused = true
      cornerStyle = BpkCardView.CornerStyle.LARGE
    }
    snap(card)
  }
}
