package com.amayl.layover.ui.screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import com.amayl.layover.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amayl.layover.ui.components.LayoutCard
import com.amayl.layover.ui.theme.DewyBlue
import com.amayl.layover.ui.theme.MorningBreeze


@Composable
fun HomeScreen(){

    Box(
        modifier = Modifier.fillMaxSize()

    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Layover logo",
            modifier = Modifier
                .padding(top = 60.dp)
                .size(140.dp)
                .clip(RoundedCornerShape(80.dp))
                .align(Alignment.TopCenter)
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Layover",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = MorningBreeze,

                )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Some moments deserve a frame✨",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(20.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                item {
                    LayoutCard(
                        image = R.drawable.layout_one,
                        layoutName = "Single Picture"
                    )
                }

                item {
                    LayoutCard(
                        image = R.drawable.layout_one,
                        layoutName = "Two Pictures"
                    )
                }
                item {
                    LayoutCard(
                        image = R.drawable.layout3,
                        layoutName = "Three Pictures"
                    )
                }
                item {
                    LayoutCard(
                        image = R.drawable.layout4,
                        layoutName = "Four Pictures"
                    )
                }
            }
        }
    }
}
