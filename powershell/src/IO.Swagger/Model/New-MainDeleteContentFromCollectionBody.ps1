function New-MainDeleteContentFromCollectionBody {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${by},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${value}
    )

    Process {
        'Creating object: IO.Swagger.Model.MainDeleteContentFromCollectionBody' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName IO.Swagger.Model.MainDeleteContentFromCollectionBody -ArgumentList @(
            ${by},
            ${value}
        )
    }
}
