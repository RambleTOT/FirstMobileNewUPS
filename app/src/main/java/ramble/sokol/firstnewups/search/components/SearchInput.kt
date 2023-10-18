package ramble.sokol.firstnewups.search.components

import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ramble.sokol.firstnewups.R
import ramble.sokol.firstnewups.ui.theme.ColorBackgroundInput
import ramble.sokol.firstnewups.ui.theme.ColorText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchInput(
    text: String,
    onValueChange: (String) -> Unit
){

    OutlinedTextField(
        value = text,
        onValueChange = onValueChange,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.fillMaxWidth(),
        textStyle = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.mont_regular)),
            fontWeight = FontWeight(600),
            color = ColorText,
        ),
        leadingIcon = {
            Icon(
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),
                painter = painterResource(id = R.drawable.icon_search),
                contentDescription = "icon_search",
                tint= Color.Unspecified
            )
        },
        placeholder = {
            Text(
                stringResource(id = R.string.text_input_hint),
                style = TextStyle(
                    color = ColorText,
                    fontFamily = FontFamily(Font(R.font.mont_regular)),
                    lineHeight = 15.6.sp,
                    fontWeight = FontWeight(500),
                )
            ) },
        colors = TextFieldDefaults.textFieldColors(
            cursorColor = ColorText,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            containerColor = ColorBackgroundInput,
        ),
        singleLine = true
    )

}